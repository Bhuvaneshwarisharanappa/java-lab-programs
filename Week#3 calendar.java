public class CalendarEvent {
    private String eventTitle;
    private String eventDate;
    private String eventLocation;
    public CalendarEvent(String title, String date, String location) {
        eventTitle = title;
        eventDate = date;
        eventLocation = location;
    }
    public void setEventTitle(String title) {
        eventTitle = title;
    }
    public void setEventDate(String date) {
        eventDate = date;
    }
    public void setEventLocation(String location) {
        eventLocation = location;
    }
    public String getEventTitle() {
        return eventTitle;
    }
    public String getEventDate() {
        return eventDate;
    }
    public String getEventLocation() {
        return eventLocation;
    }
    public void displayEventDetails() {
        System.out.println("Event Title: " + eventTitle);
        System.out.println("Event Date: " + eventDate);
        System.out.println("Event Location: " + eventLocation);
    }
    public static void main(String[] args) {
        CalendarEvent myEvent = new CalendarEvent("Birthday Party", "2024-04-30", "My House");    
        myEvent.displayEventDetails();
    }
}
