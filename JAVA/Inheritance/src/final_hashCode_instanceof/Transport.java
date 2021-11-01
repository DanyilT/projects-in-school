package final_hashCode_instanceof;

public class Transport {
    final String type;
    int size;
    public Transport(String type, int size) {
        this.type = type;
        this.size = size;
    }
    @Override
    public int hashCode() {
        final int a = 8;
        int b = 13;
        return a * b + size + ((type == null) ? 0 : type.hashCode());
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Transport)) return false;
        Transport other = (Transport) object;
        if (size != other.size) return false;
        if (type == null) {
            if (other.type != null) return false;
        } else if (!type.equals(other.type)) return false;
        return true;
    }
    @Override
    public String toString() {
        return "size = " + size + ", type = " + type;
    }
}
