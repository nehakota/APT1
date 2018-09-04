
public class CirclesCountry {
	public boolean isInside(int x, int y, int cx, int cy, int r){
		double dist;
		dist = Math.pow((cx-x), 2) + Math.pow(cy-y, 2);
		return dist < r*r;	
	}
    public int leastBorders(int[] x, int[] y, int[] r, int x1, int y1, int x2, int y2) {
    		int crosses = 0;
    		for(int k = 0; k<x.length; k++){
    			if (isInside(x1, y1, x[k], y[k], r[k]) && ! isInside(x2, y2, x[k], y[k], r[k])) {
    				crosses += 1;
    			}
    			if (isInside(x2, y2, x[k], y[k], r[k]) && ! isInside(x1, y1, x[k], y[k], r[k])){ 
    				crosses += 1;
    			}
    		}
    		return crosses;

    }
    	
    	}
    