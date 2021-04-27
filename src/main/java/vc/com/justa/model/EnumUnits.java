package vc.com.justa.model;

public enum EnumUnits {

	MINUTE("minute", 60), HOUR("hour", 360), DAY("day", 86400), DEGREE("degree", 3.14 / 180),
	ARCMINUTE("arcminute", 3.14 / 10800), ARCSECOND("arcsecond", 3.14 / 648000), HECTARE("hectare", Math.pow(1000, 2)),
	LITRE("litre", Math.pow(0.0001, 3)), TONNE("tonne", 1000);

	private String name;
	private double value;

	private EnumUnits(String name, double value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return this.name;
	}

	public double getValue() {
		return this.value;
	}

	public static Double toEnum(String pValue) {

		for (EnumUnits unit : EnumUnits.values()) {
			if (pValue.indexOf(unit.getName()) != -1) {
				pValue = pValue.replace(unit.getName(), String.valueOf(unit.getValue()));
			}
		}

		return Double.parseDouble(pValue);

	}

}
