package com.example.demo.util;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class AgeType {
	public static final Map<Integer, String> AGE;
	static {
		//Map<キーのクラス,値のクラス>
		Map<Integer, String> age = new LinkedHashMap<>();
		//putで値とキーを対応付ける
		age.put(0, "未選択");
		age.put(1, "10代");
		age.put(2, "20代");
		age.put(3, "30代");
		age.put(4, "40代");
		age.put(5, "50代");
		age.put(6, "60代以上");
		//GENDERSを変更不可にする
		AGE = Collections.unmodifiableMap(age);
	}

}