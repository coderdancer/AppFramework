/*
 * Copyright (C) 2015 The AppFramework Project
 */
package com.hyena.framework.app.widget;

import android.content.Context;

public class CommonEmptyView extends EmptyView {

	public CommonEmptyView(Context context) {
		super(context);
	}

	@Override
	public void showNoNetwork() {

	}

	@Override
	public void showEmpty(String hint) {

	}

	@Override
	public void showEmpty(int resId, String hint, String desc, String btnTxt, OnClickListener btnClickListener) {

	}

}
