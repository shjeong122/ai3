module my_module_a {
	exports pack1;
	//exports pack2;
	requires transitive my_module_b; // 전이 의존 _ b가 전이적으로 필요하다, build path 필요
}