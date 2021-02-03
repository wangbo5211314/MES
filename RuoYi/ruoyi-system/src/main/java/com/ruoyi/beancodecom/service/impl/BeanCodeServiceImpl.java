package com.ruoyi.beancodecom.service.impl;

import java.util.List;

import com.ruoyi.common.exception.BusinessException;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.system.service.ISysConfigService;
import com.ruoyi.system.service.impl.SysUserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.beancodecom.mapper.BeanCodeMapper;
import com.ruoyi.beancodecom.domain.BeanCode;
import com.ruoyi.beancodecom.service.IBeanCodeService;
import com.ruoyi.common.core.text.Convert;

/**
 * 豆码比对Service业务层处理
 * 
 * @author 王博
 * @date 2021-01-04
 */
@Service
public class BeanCodeServiceImpl implements IBeanCodeService
{
    private static final Logger log = LoggerFactory.getLogger(SysUserServiceImpl.class);
    @Autowired
    private BeanCodeMapper beanCodeMapper;

    @Autowired
    private ISysConfigService configService;

    /**
     * 查询豆码比对
     *
     * @param id 豆码比对ID
     * @return 豆码比对
     */
    @Override
    public BeanCode selectBeanCodeById(Long id)
    {
        return beanCodeMapper.selectBeanCodeById(id);
    }

    /**
     * 查询豆码比对列表
     *
     * @param beanCode 豆码比对
     * @return 豆码比对
     */
    @Override
    public List<BeanCode> selectBeanCodeList(BeanCode beanCode)
    {
        return beanCodeMapper.selectBeanCodeList(beanCode);
    }

    /**
     * 新增豆码比对
     *
     * @param beanCode 豆码比对
     * @return 结果
     */
    @Override
    public int insertBeanCode(BeanCode beanCode)
    {
        return beanCodeMapper.insertBeanCode(beanCode);
    }

    /**
     * 修改豆码比对
     *
     * @param beanCode 豆码比对
     * @return 结果
     */
    @Override
    public int updateBeanCode(BeanCode beanCode)
    {
        return beanCodeMapper.updateBeanCode(beanCode);
    }

    /**
     * 删除豆码比对对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteBeanCodeByIds(String ids)
    {
        return beanCodeMapper.deleteBeanCodeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除豆码比对信息
     *
     * @param id 豆码比对ID
     * @return 结果
     */
    @Override
    public int deleteBeanCodeById(Long id)
    {
        return beanCodeMapper.deleteBeanCodeById(id);
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
    public String importBeanCode(List<BeanCode> beanCodeList, Boolean isUpdateSupport) {

            if (StringUtils.isNull(beanCodeList) || beanCodeList.size() == 0) {
                throw new BusinessException("导入豆码数据不能为空！");
            }
            int successNum = 0;
            int failureNum = 0;
            StringBuilder successMsg = new StringBuilder();
            StringBuilder failureMsg = new StringBuilder();
            /*String password = configService.selectConfigByKey("sys.user.initPassword");*/
           for (BeanCode bc : beanCodeList) {

               this.insertBeanCode(bc);
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
    public void deleteAlljf() {
        beanCodeMapper.deleteAllBeanCode();
    }

    /*对比结果查询*/
    @Override
    public List<BeanCode> selectBeanCodeJgList(BeanCode beanCode) {
        return beanCodeMapper.selectBeanCodeJgList(beanCode);
    }


}


