package com.harbois.komrade.v1.component.properties;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.harbois.komrade.v1.common.repositories.EnvPropertyChildRepository;

public interface ComponentPropertyRepository extends EnvPropertyChildRepository<ComponentProperty>, JpaRepository<ComponentProperty, String>{
	String QUERY1 = "SELECT * FROM COMP_PROP WHERE COMP_ID=?1 AND NAME=?2";
	@Query(value=QUERY1, nativeQuery=true)
	ComponentProperty findByName(String componentId, String name);

	String QUERY2 = "SELECT * FROM COMP_PROP WHERE COMP_ID=?1";
	@Query(value=QUERY2, nativeQuery=true)
	List<ComponentProperty> findAll(String componentId);
}
