import java.util.List;
public interface RouteDAO {
	

	
	       public void insertRoute( Route route);
	       public Route selectRoute(int rid);
	       public List<Route> selectRoutes();
	       public void updateRoutes(Route route);
	       public void deleteRoute(int rid);

	}




