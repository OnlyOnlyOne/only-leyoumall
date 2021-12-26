package cn.itcast.user.itcastuser.mapper;


import cn.itcast.user.itcastuser.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

//    User selectByName(String username);
//
//    User selectLogin(@Param("userName") String username,@Param("password") String password);

}