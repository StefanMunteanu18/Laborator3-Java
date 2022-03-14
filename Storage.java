public interface Storage {
    int getStorageCapacity();
    void setStorageCapacity(int storageCapacity);
    default long getStorageCapacityConvert(String unit){
        long convertedCapacity = 0;
        switch (unit){
            case "megabyte" :
                convertedCapacity = getStorageCapacity()*1000;
                break;
            case "kilobyte" :
                convertedCapacity = getStorageCapacity()*1000000;
                break;
            case "byte" :
                convertedCapacity = getStorageCapacity()*1000000000;
                break;
        }
        return convertedCapacity;
    }
}
