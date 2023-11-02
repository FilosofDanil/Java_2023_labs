package lab;

public interface Protoype {
    Protoype deepClone() throws CloneNotSupportedException;

    Protoype surfaceClone();
}
