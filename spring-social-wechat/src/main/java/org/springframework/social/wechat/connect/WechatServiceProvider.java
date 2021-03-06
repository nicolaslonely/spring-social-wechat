/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.wechat.connect;

import org.springframework.social.wechat.api.Wechat;
import org.springframework.social.wechat.api.impl.WechatTemplate;
import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;

/**
 * Wechat ServiceProvider implementation.
 * @author Keith Donald
 * @author Craig Walls
 */
public class WechatServiceProvider extends AbstractOAuth2ServiceProvider<Wechat> {

	/**
	 * Creates a WechatServiceProvider for the given application ID, secret, and namespace.
	 * @param appId The application's App ID as assigned by Wechat 
	 * @param appSecret The application's App Secret as assigned by Wechat
	 */
	public WechatServiceProvider(String appId, String appSecret) {
		super(new WechatOAuth2Template(appId, appSecret));
	}

	public Wechat getApi(String accessToken) {
		return new WechatTemplate(accessToken);
	}
	
}
