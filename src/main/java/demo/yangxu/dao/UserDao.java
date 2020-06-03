package demo.yangxu.dao;

import demo.yangxu.domain.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 用户的持久层接口
 */
public interface UserDao {
    /**
     * 查询用户列表
     * @return
     */
    @Select("select * from user")
    List<User> findAll();

    /**
     * 根据id查询
     * @param userId
     * @return
     */
    @Select("select * from user where id = #{userId}")
    User findById(Integer userId);

    /**
     * 更新用户
     * @param user
     */
    @Update("update user set age=#{age},username=#{username},PASSWORD=#{PASSWORD},email=#{email},sex=#{sex} where id=#{id}")
    void updateUser(User user);
}
