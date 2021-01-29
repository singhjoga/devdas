package com.harbois.oauth.api.v1.common.domain;

import java.io.Serializable;

public interface IdentifiableEntity<ID extends Serializable> {
	public ID getId();
	public void setId(ID id);
}
