package ch0603;

public class P257Earth {
	// 상수 : 불변의 값(원주율, 지구넓이 및 둘레 등)
	//static final 변수자료형 변수명 = 초기값
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	static {
		EARTH_SURFACE_AREA = 4*Math.PI * EARTH_RADIUS*EARTH_RADIUS;
	}
	
}
