package org.disges.thrift.plugin.parameters;

import org.disges.thrift.plugin.classes.PojoInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class PojoParameterMap extends PojoParameter {
	public PojoParameter pojoKey;
	public PojoParameter pojoValue;

	public PojoParameterMap(String type, String paramName) {
		super(type, paramName);
		this.setGenericMap(true);
		this.setPojoType("java.util.Map");

		List<String> genericList = new ArrayList<String>(Arrays.asList(type.substring(14, type.length() - 1).split(",")));
		if (genericList.size() != 2) {
			throw new IllegalArgumentException("Maps must contain two generic values");
		}

		pojoKey = new PojoParameter(genericList.get(0), paramName);
		pojoKey.setPojoType(pojoKey.getType());
		pojoValue = new PojoParameter(genericList.get(1), paramName);
		pojoValue.setPojoType(pojoValue.getType());
	}

    @Override
	public void remmapParameters(Map<String, PojoInterface> thirftNameToPojoClassMap) {
		pojoKey.remmapParameters(thirftNameToPojoClassMap);
		pojoValue.remmapParameters(thirftNameToPojoClassMap);
	}
}
