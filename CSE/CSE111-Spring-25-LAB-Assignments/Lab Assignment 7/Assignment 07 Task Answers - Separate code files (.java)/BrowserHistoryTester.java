public class BrowserHistoryTester {
public static void main(String[] args){
BrowserHistory chrome = new BrowserHistory(3);
System.out.println(chrome.count + " web pages visited.");
System.out.println("1=========");
chrome.showHistory();
System.out.println("2=========");
chrome.currentWeb();
System.out.println("3=========");
chrome.visitWeb("www.google.com");
chrome.visitWeb("www.facebook.com");
chrome.visitWeb("www.youtube.com");
chrome.visitWeb("www.reddit.com");
System.out.println("4=========");
System.out.println(chrome.count + " web pages visited.");
System.out.println("5=========");
chrome.showHistory();
System.out.println("6=========");
chrome.currentWeb();
System.out.println("7=========");
chrome.back();
System.out.println("8=========");
System.out.println(chrome.count + " web pages visited.");
System.out.println("9=========");
chrome.currentWeb();
System.out.println("10=========");
chrome.back();
System.out.println("11=========");
chrome.currentWeb();
System.out.println("12=========");
chrome.back();
System.out.println("13=========");
chrome.currentWeb();
System.out.println("14=========");
System.out.println(chrome.count + " web pages visited.");
}
}