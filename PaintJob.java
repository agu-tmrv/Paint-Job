
public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
    int returnValue = 0;

    if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
        returnValue = -1;
    } else {
        double wallArea = width * height;
        int neededBuckets = (int) Math.ceil(wallArea / areaPerBucket) - extraBuckets;
        returnValue = neededBuckets;
    }

    return returnValue;
}

public static int getBucketCount(double width, double height, double areaPerBucket) {
    int returnValue = 0;

    if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
        returnValue = -1;
    } else {
        double wallArea = width * height;
        int neededBuckets = (int) Math.ceil(wallArea / areaPerBucket);
        returnValue = neededBuckets;
    }

    return returnValue;
}

public static int getBucketCount(double wallArea, double areaPerBucket) {
    int returnValue = 0;

    if (wallArea <= 0 || areaPerBucket <= 0) {
        returnValue = -1;
    } else {
        int neededBuckets = (int) Math.ceil(wallArea / areaPerBucket);
        returnValue = neededBuckets;
    }

    return returnValue;
}
}
