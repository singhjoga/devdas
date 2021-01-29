package com.harbois.komrade.v1.component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonView;
import com.harbois.common.auditing.Auditable;
import com.harbois.common.validation.annotations.NotNullable;
import com.harbois.common.validation.annotations.UpdatePolicy;
import com.harbois.komrade.constants.Entities;
import com.harbois.oauth.api.v1.common.Views;
import com.harbois.oauth.api.v1.common.domain.BaseAuditableEntity;
import com.harbois.oauth.api.v1.common.domain.GeneratedUuid;
import com.harbois.oauth.api.v1.common.domain.StatusChangeable;

@Entity(name="COMP")
public class Component extends BaseAuditableEntity implements Auditable<String>, GeneratedUuid,StatusChangeable{
	@Id
	@Column(name="COMP_ID")
	@JsonView(value= {Views.List.class})
	@UpdatePolicy(updateable=false,insertable=false)
	private String id;
	@NotNullable	
	@Column(name="NAME")
	@JsonView(value= {Views.Add.class,Views.Update.class,Views.List.class})
	private String name;
	@NotNullable
	@Column(name="DESCRIPTION")
	@JsonView(value= {Views.Add.class,Views.Update.class,Views.List.class})
	private String description;
	@Column(name="TEAM_CODE")
	@JsonView(value= {Views.Add.class,Views.Update.class,Views.List.class})
	@NotNullable
	private String teamCode;
	@Column(name="COMP_TYPE_CODE")
	@JsonView(value= {Views.Add.class,Views.Update.class,Views.List.class})
	@NotNullable
	private String typeCode;
	@Column(name="PIPELINE_ID")
	@JsonView(value= {Views.Add.class,Views.Update.class,Views.List.class})
	private String pipelineId;
	@Column(name="STATUS")
	@JsonView(value= {Views.List.class})
	private String status;	
	@Override
	public String getObjectType() {
		return Entities.COMPONENT;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTeamCode() {
		return teamCode;
	}
	public void setTeamCode(String teamCode) {
		this.teamCode = teamCode;
	}
	public String getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	public String getPipelineId() {
		return pipelineId;
	}
	public void setPipelineId(String pipelineId) {
		this.pipelineId = pipelineId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
