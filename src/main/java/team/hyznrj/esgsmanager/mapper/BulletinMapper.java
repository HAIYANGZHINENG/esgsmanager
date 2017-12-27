package team.hyznrj.esgsmanager.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import team.hyznrj.esgsmanager.entity.Bulletin;
import team.hyznrj.esgsmanager.entity.BulletinExample;

public interface BulletinMapper {
    int countByExample(BulletinExample example);

    int deleteByExample(BulletinExample example);

    int deleteByPrimaryKey(Long bulletinid);

    int insert(Bulletin record);

    int insertSelective(Bulletin record);

    List<Bulletin> selectByExample(BulletinExample example);

    Bulletin selectByPrimaryKey(Long bulletinid);

    int updateByExampleSelective(@Param("record") Bulletin record, @Param("example") BulletinExample example);

    int updateByExample(@Param("record") Bulletin record, @Param("example") BulletinExample example);

    int updateByPrimaryKeySelective(Bulletin record);

    int updateByPrimaryKey(Bulletin record);
}