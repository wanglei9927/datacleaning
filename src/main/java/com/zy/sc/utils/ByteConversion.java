package com.zy.sc.utils;

import java.util.ArrayList;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ByteConversion {

	/**
	 * 
	 * @param blePosition 0:侧弯 1:曲度 2：颈椎
	 * @param Str
	 * @return
	 */
	public static JSONObject getData(int blePosition, String Str) {
		Str = Str.substring(12, Str.length() - 8);

		JSONObject json = new JSONObject();
		JSONArray jsonArray = new JSONArray();

		byte[] b;
		switch (blePosition) {
		case 0:
			b = ByteUtils.getHexBytes(Str.substring(0, 144));
			json.put("x0x1", ByteUtils.byteArrayToStr(new byte[] { b[0], b[1] }));
			json.put("x2", ByteUtils.byteArrayToStr(new byte[] { b[2] }));
			json.put("x3", ByteUtils.byteArrayToStr(new byte[] { b[3] }));
			json.put("x4", ByteUtils.byteArrayToStr(new byte[] { b[4] }));
			json.put("x5", ByteUtils.byteArrayToStr(new byte[] { b[5] }));
			json.put("x6x7", ByteUtils.byteArrayToStr(new byte[] { b[6], b[7] }));
			json.put("x8x9", ByteUtils.byteArrayToStr(new byte[] { b[8], b[9] }));
			json.put("x10", ByteUtils.byteArrayToStr(new byte[] { b[10] }));
			json.put("x11", ByteUtils.byteArrayToStr(new byte[] { b[11] }));
			json.put("x12", ByteUtils.byteArrayToStr(new byte[] { b[12] }));
			json.put("x13", ByteUtils.byteArrayToStr(new byte[] { b[13] }));
			Str = Str.substring(72 * 2);
			break;
		case 1:
			b = ByteUtils.getHexBytes(Str.substring(0, 160));
			json.put("x0x1", ByteUtils.byteArrayToStr(new byte[] { b[0], b[1] }));
			json.put("x2", ByteUtils.byteArrayToStr(new byte[] { b[2] }));
			json.put("x3", ByteUtils.byteArrayToStr(new byte[] { b[3] }));
			json.put("x4", ByteUtils.byteArrayToStr(new byte[] { b[4] }));
			json.put("x5", ByteUtils.byteArrayToStr(new byte[] { b[5] }));
			json.put("x6", ByteUtils.byteArrayToStr(new byte[] { b[6] }));
			json.put("x7", ByteUtils.byteArrayToStr(new byte[] { b[7] }));
			json.put("x8", ByteUtils.byteArrayToStr(new byte[] { b[8] }));
			json.put("x9", ByteUtils.byteArrayToStr(new byte[] { b[9] }));
			json.put("x10", ByteUtils.byteArrayToStr(new byte[] { b[10] }));
			json.put("x11", ByteUtils.byteArrayToStr(new byte[] { b[11] }));
			json.put("x12x13", ByteUtils.byteArrayToStr(new byte[] { b[12], b[13] }));
			json.put("x14", ByteUtils.byteArrayToStr(new byte[] { b[14] }));
			json.put("x15", ByteUtils.byteArrayToStr(new byte[] { b[15] }));
			json.put("x16", ByteUtils.byteArrayToStr(new byte[] { b[16] }));
			json.put("x17", ByteUtils.byteArrayToStr(new byte[] { b[17] }));
			json.put("x18", ByteUtils.byteArrayToStr(new byte[] { b[18] }));
			json.put("x19", ByteUtils.byteArrayToStr(new byte[] { b[19] }));
			json.put("x20", ByteUtils.byteArrayToStr(new byte[] { b[20] }));
			json.put("x21", ByteUtils.byteArrayToStr(new byte[] { b[21] }));
			json.put("x22", ByteUtils.byteArrayToStr(new byte[] { b[22] }));
			json.put("x23", ByteUtils.byteArrayToStr(new byte[] { b[23] }));
			Str = Str.substring(80 * 2);
			break;
		case 2:
			b = ByteUtils.getHexBytes(Str.substring(0, 160));
			json.put("x0x1", ByteUtils.byteArrayToStr(new byte[] { b[0], b[1] }));
			json.put("x2x3", ByteUtils.byteArrayToStr(new byte[] { b[2], b[3] }));
			json.put("x4x5", ByteUtils.byteArrayToStr(new byte[] { b[4], b[5] }));
			json.put("x6x7", ByteUtils.byteArrayToStr(new byte[] { b[6], b[7] }));
			json.put("x8x9", ByteUtils.byteArrayToStr(new byte[] { b[8], b[9] }));
			json.put("x10x11", ByteUtils.byteArrayToStr(new byte[] { b[10], b[11] }));
			json.put("x12x13", ByteUtils.byteArrayToStr(new byte[] { b[12], b[13] }));
			json.put("x14x15", ByteUtils.byteArrayToStr(new byte[] { b[14], b[15] }));
			json.put("x16x17", ByteUtils.byteArrayToStr(new byte[] { b[16], b[17] }));
			json.put("x18x19", ByteUtils.byteArrayToStr(new byte[] { b[18], b[19] }));
			json.put("x20x21", ByteUtils.byteArrayToStr(new byte[] { b[20], b[21] }));
			json.put("x22x23", ByteUtils.byteArrayToStr(new byte[] { b[22], b[23] }));
			Str = Str.substring(80 * 2);
			break;
		}

		switch (blePosition) {
		case 0:
			for (int i = 0; i < 17; i++) {
				String dStr = Str.substring(i * 21 * 2, i * 21 * 2 + 21 * 2);
				JSONObject jsonObject = new JSONObject();
				jsonObject.put(i + "",
						ByteUtils.byteArrayToStr(ByteUtils.getHexBytes(dStr.substring(2, dStr.length()))));
				jsonArray.add(jsonObject);
			}
			break;
		case 1:
			for (int i = 0; i < 17; i++) {
				String dStr = Str.substring(i * 21 * 2, i * 21 * 2 + 21 * 2);
//	                    Log.e("ddd", "第" + (i + 1) + "组数据" + dStr);
//	                    Log.e("ddd", "第" + (i + 1) + "组数据" + ByteUtils.byteArrayToStr(ByteUtils.getHexBytes(dStr)));
				JSONObject jsonObject = new JSONObject();
				jsonObject.put(i + "", BleDataUtils
						.toRadians(ByteUtils.byteArrayToStr(ByteUtils.getHexBytes(dStr.substring(2, dStr.length())))));
				jsonArray.add(jsonObject);
			}
//	                合并数据
			ArrayList<Float> floats = new ArrayList<>();
			for (int i = 0; i < jsonArray.size(); i++) {
				String[] strings = jsonArray.getJSONObject(i).getString(i + "").split(",");
				for (String item : strings) {
					floats.add(Float.valueOf(item));
				}
			}
//	                将每个数据和上个数据相加
			for (int i = 0; i < floats.size(); i++) {
				if (i > 0) {
					Float f = floats.get(i - 1) + floats.get(i);
					floats.set(i, f);
				}
			}

			for (int i = 0; i < 17; i++) {
				String str = "";
				for (int j = 0; j < 10; j++) {
					str += floats.get(i * 10 + j) + ",";
				}
				str = str.substring(0, str.length() - 1);
				JSONObject jsonObject = new JSONObject();
				jsonObject.put(i + "", str);
				jsonArray.set(i, jsonObject);
			}

			break;
		case 2:
			for (int i = 0; i < 3; i++) {
				String dStr = Str.substring(i * 200 * 2, i * 200 * 2 + 200 * 2);
				JSONObject jsonObject = new JSONObject();
				jsonObject.put(i + "", ByteUtils.byteArrayToStr(ByteUtils.getHexBytes(dStr)));
				jsonArray.add(jsonObject);
			}
			break;
		}

		json.put("data", jsonArray);
		JSONObject jsonObject = (JSONObject) json.clone();

		json.put("testValue", jsonObject.toJSONString());
		json.remove("data");
		return json;
	}
}
