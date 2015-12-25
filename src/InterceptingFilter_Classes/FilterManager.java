package InterceptingFilter_Classes;

import MVC_Classes.LoginModel;

public class FilterManager {

	FilterChain filterChain;

	public FilterManager() {
		filterChain = new FilterChain();
	}

	public void setFilter(Filter filter) {
		filterChain.addFilter(filter);
	}

	public void filterRequest(LoginModel model) {
		filterChain.execute(model);
	}
}
