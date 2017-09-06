package com.quinnnorris.ssm.mapper;

import com.quinnnorris.ssm.bean.UserCustom;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Title: UserCustomMapper
 * Description: UserCustomMapper映射查询sql方法
 * Company: www.QuinnNorris.com
 *
 * @date: 2017/9/5 下午7:15 星期二
 * @author: quinn_norris
 * @version: 1.0
 */
@Repository("userCustomMapper")
public interface UserCustomMapper {

    public List<UserCustom> selectUserByEmail(UserCustom userCustom);

    public void insertUserFromReg(UserCustom userCustom);

}
