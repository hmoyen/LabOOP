public interface AnelAbstrato<T> {
    public T zero();
    public T um();
    public T soma(T este, T outro);
    public T produto(T este, T outro);
    public T negativo(T outro);
}
