package io.choerodon.gateway.mapper;

import io.choerodon.gateway.dto.ProjectDTO;
import io.choerodon.mybatis.common.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 权限mapper
 *
 * @author Eugen
 */
public interface ProjectMapper extends Mapper<ProjectDTO> {
    /**
     * 根据项目ID获取项目类别
     *
     * @param projectId 项目主键
     * @return 项目类别
     */
    List<String> getCategoriesByProjId(@Param("project_id") Long projectId);

}
