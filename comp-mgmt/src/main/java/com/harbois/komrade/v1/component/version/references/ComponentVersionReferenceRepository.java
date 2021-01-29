package com.harbois.komrade.v1.component.version.references;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.harbois.komrade.v1.common.repositories.ChildEntityRepository;

public interface ComponentVersionReferenceRepository extends JpaRepository<ComponentVersionReference, String>,ChildEntityRepository<ComponentVersionReference, String, String>{
	String QUERY2 = "SELECT * FROM COMP_VER_REF WHERE COMP_VER_ID=?1";
	@Query(value=QUERY2, nativeQuery=true)
	List<ComponentVersionReference> findAll(String componentVersionId);
}
