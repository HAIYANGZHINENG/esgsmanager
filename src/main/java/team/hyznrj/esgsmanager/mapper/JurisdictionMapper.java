package team.hyznrj.esgsmanager.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import team.hyznrj.esgsmanager.entity.JurisdictionExample;
import team.hyznrj.esgsmanager.entity.JurisdictionKey;

public interface JurisdictionMapper {
    int countByExample(JurisdictionExample example);

    int deleteByExample(JurisdictionExample example);

    int deleteByPrimaryKey(JurisdictionKey key);

    int insert(JurisdictionKey record);

    int insertSelective(JurisdictionKey record);

    List<JurisdictionKey> selectByExample(JurisdictionExample example);

    int updateByExampleSelective(@Param("record") JurisdictionKey record, @Param("example") JurisdictionExample example);

    int updateByExample(@Param("record") JurisdictionKey record, @Param("example") JurisdictionExample example);
}