package InterceptingFilter_Classes;

import java.util.ArrayList;
import java.util.List;

import MVC_Classes.LoginModel;

public class FilterChain {

	private List<Filter> filters = new ArrayList<Filter>();

	public void addFilter(Filter filter) {
		filters.add(filter);
	}

	public void execute(LoginModel model) {
		for (Filter filter : filters) {
			filter.execute(model);
		}
	}

}
