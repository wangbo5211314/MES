package com.ruoyi.beancodecom.service.impl;

import java.util.List;

import com.ruoyi.common.exception.BusinessException;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.beancodecom.mapper.BeanCodeScsjMapper;
import com.ruoyi.beancodecom.domain.BeanCodeScsj;
import com.ruoyi.beancodecom.service.IBeanCodeScsjService;
import com.ruoyi.common.core.text.Convert;

/**
 * 生产数据豆码Service业务层处理
 * 
 * @author 王博
 * @date 2021-01-04
 */
@Service
public class BeanCodeScsjServiceImpl implements IBeanCodeScsjService 
{
    @Autowired
    private BeanCodeScsjMapper beanCodeScsjMapper;

    /**
     * 查询生产数据豆码
     * 
     * @param id 生产数据豆码ID
     * @return 生产数据豆码
     */
    @Override
    public BeanCodeScsj selectBeanCodeScsjById(Long id)
    {
        return beanCodeScsjMapper.selectBeanCodeScsjById(id);
    }

    /**
     * 查询生产数据豆码列表
     * 
     * @param beanCodeScsj 生产数据豆码
     * @return 生产数据豆码
     */
    @Override
    public List<BeanCodeScsj> selectBeanCodeScsjList(BeanCodeScsj beanCodeScsj)
    {
        return beanCodeScsjMapper.selectBeanCodeScsjList(beanCodeScsj);
    }

    /**
     * 新增生产数据豆码
     * 
     * @param beanCodeScsj 生产数据豆码
     * @return 结果
     */
    @Override
    public int insertBeanCodeScsj(BeanCodeScsj beanCodeScsj)
    {
        return beanCodeScsjMapper.insertBeanCodeScsj(beanCodeScsj);
    }

    /**
     * 修改生产数据豆码
     * 
     * @param beanCodeScsj 生产数据豆码
     * @return 结果
     */
    @Override
    public int updateBeanCodeScsj(BeanCodeScsj beanCodeScsj)
    {
        return beanCodeScsjMapper.updateBeanCodeScsj(beanCodeScsj);
    }

    /**
     * 删除生产数据豆码对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteBeanCodeScsjByIds(String ids)
    {
        return beanCodeScsjMapper.deleteBeanCodeScsjByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除生产数据豆码信息
     * 
     * @param id 生产数据豆码ID
     * @return 结果
     */
    @Override
    public int deleteBeanCodeScsjById(Long id)
    {
        return beanCodeScsjMapper.deleteBeanCodeScsjById(id);
    }

    /**
     * 导入豆码数据
     *
     * @param beanCodeList 用户数据列表
     * @param isUpdateSupport 是否更新支持，如果已存在，则进行更新数据
     *
     * @return 结果
     */
    @Override
    public String importBeanCodeScsj(List<BeanCodeScsj> beanCodeList, Boolean isUpdateSupport) {

        if (StringUtils.isNull(beanCodeList) || beanCodeList.size() == 0) {
            throw new BusinessException("导入豆码数据不能为空！");
        }
        int successNum = 0;
        int failureNum = 0;
        StringBuilder successMsg = new StringBuilder();
        StringBuilder failureMsg = new StringBuilder();
        /*String password = configService.selectConfigByKey("sys.user.initPassword");*/
        for (BeanCodeScsj bsc : beanCodeList) {

            this.insertBeanCodeScsj(bsc);
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


    /*王博：删除所有*/
    @Override
    public void deleteAllscsj() {
        beanCodeScsjMapper.deleteAllscsjBeanCode();
    }

    /*对比结果查询*/
    @Override
    public List<BeanCodeScsj> selectBeanCodeScsjJgList(BeanCodeScsj beanCodeScsj) {
        return beanCodeScsjMapper.selectBeanCodeScsjJgList(beanCodeScsj);
    }

}
