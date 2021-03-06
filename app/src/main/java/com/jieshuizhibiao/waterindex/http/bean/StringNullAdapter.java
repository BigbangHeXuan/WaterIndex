package com.jieshuizhibiao.waterindex.http.bean;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

public class StringNullAdapter implements JsonDeserializer<BaseEntity> {

    @Override
    public BaseEntity deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        try {
        	JsonObject obj = json.getAsJsonObject();
        	JsonElement e=obj.get("data");
        	if(!(e.isJsonObject()||e.isJsonArray())&&"".equals(e.getAsString()))
            	obj.remove("data");
        	return new Gson().fromJson(obj, typeOfT);
        } catch (JsonParseException ignore) {
            return null;
        }
    }
}
