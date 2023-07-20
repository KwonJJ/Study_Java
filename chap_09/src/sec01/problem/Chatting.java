package sec01.problem;

public class Chatting {
	String nickName = null;
	
	void startChat(String chatId) {
		// String nickName = null;
		// String nickName = chatId;
		nickName = chatId;
		
		class Chat{ // 로컬 클래스
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData;
					/*
					 * String nickName = null;
					 * 로컬 클래스가 포함된 메소드의 필드는 기본적으로 final이 붙어서
					 * 반드시 값을 대입해야함
					 * 
					 * ex)
					 * inputData = "어서오세요";
					 * 로컬 클래스의 메소드 안에 속한 필드는 해당 번위 안에서만 사용 가능함
					 */
					
					/*
					 * void startChat 안에 String nickName = null;(final이 생략된 것)을 넣으면 에러 발생
					 * 1. String nickName에 값을 넣어주면 에러 해결(final은 무조건 값을 넣어줘야함)
					 * 2. String nickName = null;를 Chatting클래스로 빼면 final이 아니기 때문에 에러 해결
					 */
					sendMessage(message);
				}
			}
			
			void sendMessage(String message) {
				
			}
		}
		Chat chat = new Chat();
		chat.start();
	}
}
