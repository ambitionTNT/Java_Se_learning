package java_Set.treeTest;

import java.util.Objects;

/**
 * @ClassName Item
 * @Description An item with a description and a part number.
 * @Author long
 * @Date 2022/12/11 20:19
 * @Version 1.0
 **/
public class Item implements Comparable<Item>{
    private String description;
    private int partNumber;

    public Item(String description, int partNumber) {
        this.description = description;
        this.partNumber = partNumber;
    }

    @Override
    public String toString() {
        return "[" +
                "description='" + description + '\'' +
                ", partNumber=" + partNumber +
                ']';

    }

    /**
     * Gets the description of this item
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    public int getPartNumber() {
        return partNumber;
    }

    @Override
    public boolean equals(Object otherObject) {
        if(this == otherObject){
            return true;
        }
        if (otherObject == null ){
            return false;
        }
        if (getClass() != otherObject.getClass()){
            return false;
        }
        Item other = (Item) otherObject;
        return Objects.equals(description,other.description) && partNumber == other.partNumber;

    }

    @Override
    public int hashCode() {
        return Objects.hash(description, partNumber);
    }

    @Override
    public int compareTo(Item o) {
        int diff=Integer.compare(partNumber, o.partNumber);
        return diff != 0 ? diff:description.compareTo(o.description);
    }

}
