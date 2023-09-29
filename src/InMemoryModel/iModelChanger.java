package InMemoryModel;

//Интерфейс отправки уведомлений
public interface iModelChanger {
    public void NotifyChange(iModelChanger sender);
}