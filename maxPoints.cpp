

// leetcode.com 149. Max Points on a Line

#include <vector>
#include <map>


struct Point {
     int x;
     int y;
     Point() : x(0), y(0) {}
     Point(int a, int b) : x(a), y(b) {}
};

using namespace std ;

class Solution {
public:
    int maxPoints(vector<Point>& points) {
    	int n = points.size() ;
    	int ans = 0 ;

    	for(int i = 0 ; i < n ; ++i)
    	{
    		map<pair<int, int>, int> count ;
    		int same_points = 1 ;
    		int max_points = 0 ;

    		for(int j = i + 1 ; j < n ; ++j)
    		{
    			const Point& p1 = points[i] ;
    			const Point& p2 = points[j] ;

    			if(p1.x == p2.x && p1.y == p2.y) 
    				++same_points ;
    			else
    				max_points = max(max_points, ++count[getSlope(p1, p2)]) ;
    		}

    		ans = max(ans, same_points + max_points) ;
    	}

    	return ans ;	    
    }

private:
	pair<int, int> getSlope(const Point& p1, const Point& p2)
	{
		const int dx = p2.x - p1.x ;
		const int dy = p2.y - p1.y ;

		if(dy == 0) return {p1.y, 0} ;

		if(dx == 0) return {0, p1.x} ;

		int d = gcd(dx, dy) ;

		return {dy / d, dx / d} ;
	}

	int gcd(int m, int n)
	{
		return n == 0 ? m : gcd(n, m % n) ;
	}
};