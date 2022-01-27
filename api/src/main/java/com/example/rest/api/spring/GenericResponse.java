package com.example.rest.api.spring;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GenericResponse {
	private String message;
	private String error;
	private HttpStatus status;

	public GenericResponse(final String message, HttpStatus status) {

		super();
		this.message = message;
		this.status = status;

	}

	public GenericResponse(final String message, final String error) {
		super();
		this.message = message;
		this.error = error;

	}

	public GenericResponse(final String message, final String error, HttpStatus status) {
		super();
		this.message = message;
		this.status = status;
		this.error = error;

	}

	public GenericResponse(final List<FieldError> fieldErrors, final List<ObjectError> globalErrors) {
		super();
		final ObjectMapper mapper = new ObjectMapper();
		try {
			this.message = mapper.writeValueAsString(fieldErrors);
			this.error = mapper.writeValueAsString(globalErrors);

		} catch (final JsonProcessingException e) {
			this.message = "";
			this.error = "";

		}

	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

}
