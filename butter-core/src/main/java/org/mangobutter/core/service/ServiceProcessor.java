package org.mangobutter.core.service;

import org.mangobutter.core.utils.Request;
import org.mangobutter.core.utils.Response;

public interface ServiceProcessor {

	void process(Request request, Response response);
}
