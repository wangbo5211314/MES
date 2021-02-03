package com.ruoyi.order.service.impl;

import java.util.List;

import com.ruoyi.common.exception.BusinessException;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.order.domain.GwOrdersReturn;
import com.ruoyi.order.mapper.GwOrdersReturnMapper;
import com.ruoyi.order.service.IGwOrdersReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.core.text.Convert;

/**
 * 国网采购订单-返回Service业务层处理
 * 
 * @author wangbo
 * @date 2020-12-08
 */
@Service("htManage")
public class GwOrdersReturnServiceImpl implements IGwOrdersReturnService
{
    @Autowired
    private GwOrdersReturnMapper gwOrdersReturnMapper;

    /**
     * 查询国网采购订单-返回
     * 
     * @param nnReturnId 国网采购订单-返回ID
     * @return 国网采购订单-返回
     */
    @Override
    public GwOrdersReturn selectGwOrdersReturnById(Long nnReturnId)
    {
        return gwOrdersReturnMapper.selectGwOrdersReturnById(nnReturnId);
    }

    /**
     * 查询国网采购订单-返回列表
     * 
     * @param gwOrdersReturn 国网采购订单-返回
     * @return 国网采购订单-返回
     */
    @Override
    public List<GwOrdersReturn> selectGwOrdersReturnList(GwOrdersReturn gwOrdersReturn)
    {
        return gwOrdersReturnMapper.selectGwOrdersReturnList(gwOrdersReturn);
    }

    /**
     * 新增国网采购订单-返回
     * 
     * @param gwOrdersReturn 国网采购订单-返回
     * @return 结果
     */
    @Override
    public int insertGwOrdersReturn(GwOrdersReturn gwOrdersReturn)
    {
        return gwOrdersReturnMapper.insertGwOrdersReturn(gwOrdersReturn);
    }

    /**
     * 修改国网采购订单-返回
     * 
     * @param gwOrdersReturn 国网采购订单-返回
     * @return 结果
     */
    @Override
    public int updateGwOrdersReturn(GwOrdersReturn gwOrdersReturn)
    {
        gwOrdersReturn.setUpdateTime(DateUtils.getNowDate());
        return gwOrdersReturnMapper.updateGwOrdersReturn(gwOrdersReturn);
    }

    /**
     * 删除国网采购订单-返回对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteGwOrdersReturnByIds(String ids)
    {
        return gwOrdersReturnMapper.deleteGwOrdersReturnByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除国网采购订单-返回信息
     * 
     * @param nnReturnId 国网采购订单-返回ID
     * @return 结果
     */
    @Override
    public int deleteGwOrdersReturnById(Long nnReturnId)
    {
        return gwOrdersReturnMapper.deleteGwOrdersReturnById(nnReturnId);
    }

    /**
     * 导入国网订单返回
     *
     * @param gwOrdersReturnsList
     * @param isUpdateSupport 是否更新支持，如果已存在，则进行更新数据
     *
     * @return 结果
     */
    @Override
    public String importGwordersreturn(List<GwOrdersReturn> gwOrdersReturnsList, Boolean isUpdateSupport) {

        if (StringUtils.isNull(gwOrdersReturnsList) || gwOrdersReturnsList.size() == 0) {
            throw new BusinessException("导入豆码数据不能为空！");
        }
        int successNum = 0;
        int failureNum = 0;
        StringBuilder successMsg = new StringBuilder();
        StringBuilder failureMsg = new StringBuilder();
        /*String password = configService.selectConfigByKey("sys.user.initPassword");*/
        for (GwOrdersReturn gor : gwOrdersReturnsList) {

            this.insertGwOrdersReturn(gor);
            successNum++;


               /* try
                {
                    // 验证是否存在这个用户
                    BeanCode u = userMapper.selectUserByLoginName(user.getLoginName());
                    if (StringUtils.isNull(u))
                    {
                        user.setPassword(Md5Utils.hash(user.getLoginName() + password));
                        user.setCreateBy(operName);
                        this.insertUser(user);
                        successNum++;
                        successMsg.append("<br/>" + successNum + "、账号 " + user.getLoginName() + " 导入成功");
                    }
                    else if (isUpdateSupport)
                    {
                        user.setUpdateBy(operName);
                        this.updateUser(user);
                        successNum++;
                        successMsg.append("<br/>" + successNum + "、账号 " + user.getLoginName() + " 更新成功");
                    }
                    else
                    {
                        failureNum++;
                        failureMsg.append("<br/>" + failureNum + "、账号 " + user.getLoginName() + " 已存在");
                    }
                }
                catch (Exception e)
                {
                    failureNum++;
                    String msg = "<br/>" + failureNum + "、账号 " + user.getLoginName() + " 导入失败：";
                    failureMsg.append(msg + e.getMessage());
                    log.error(msg, e);
                }*/
        }
        if (failureNum > 0) {
            failureMsg.insert(0, "很抱歉，导入失败！共 " + failureNum + " 条数据格式不正确，错误如下：");
            throw new BusinessException(failureMsg.toString());
        } else {
            successMsg.insert(0, "恭喜您，数据已全部导入成功！共 " + successNum + " 条，数据如下：");
        }
        return successMsg.toString();
    }

}
