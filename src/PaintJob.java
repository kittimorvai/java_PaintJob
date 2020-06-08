public class PaintJob {

    //Checking if there is enough supply to paint the walls

    
    public static void main(String[] args) {
        System.out.println(getBucketCount(-2.75,3.25,2.5,1));
        System.out.println(getBucketCount(7.25,4.3,2.35));
        System.out.println(getBucketCount(3.26,0.75));
    }

    // if resupply is available
    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets <0){
            return -1;
        } else {
            double area = width * height;
            return getBucketCount(area, areaPerBucket)-extraBuckets;
        }
    }

    // if resupply is unavailable
    public static int getBucketCount (double width, double height, double areaPerBucket){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        } else {
            double area = width * height;
            return getBucketCount(area, areaPerBucket);
        }
    }

    // if the height and the width of the wall is unknown but the are is known
    public static int getBucketCount (double area, double areaPerBucket)  {
        if (area <= 0 || areaPerBucket <= 0){
            return -1;
        } else {
            double bucketsToBuy = Math.ceil(area / areaPerBucket);
            return (int) bucketsToBuy;
        }
    }
}
