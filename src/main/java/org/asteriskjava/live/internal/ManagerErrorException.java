package org.asteriskjava.live.internal;

import org.asteriskjava.live.LiveException;
import org.asteriskjava.manager.response.ManagerError;

public class ManagerErrorException extends LiveException {
	private final ManagerError response;

	protected ManagerErrorException(ManagerError response) {
		super(response.getMessage());
		this.response = response;
	}

	public ManagerError getResponse() {
		return response;
	}
}
