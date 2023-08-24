package creational.factoryMethod;

import java.util.HashMap;

public class ItemFactory extends Factory{
	
	
	//아이템을 생성할 수 있는 최대 수를 지정할 수 있게 내부 클래스 선언
	private class ItemData {
		int maxCount;
		int currentCount;
		
		ItemData(int maxCount){
			this.maxCount = maxCount;	
		}
	}
	
	
	
	private HashMap<String, ItemData> repository;
	
	
	public ItemFactory() {
		repository = new HashMap<>();
		
		//아이템 최대 생성 개수 설정
		repository.put("sword", new ItemData(3));
		repository.put("shield", new ItemData(2));
		repository.put("bow", new ItemData(1));
	}


	
	@Override
	public boolean isCreatable(String name) {
		ItemData itemData = repository.get(name);
		
		if(itemData == null) {
			System.out.println(name + "은(는) 알 수 없는 아이템입니다.");
			return false;
		}
		
		if(itemData.currentCount >= itemData.maxCount) {
			System.out.println(name + "은(는) 품절 아이템입니다.");
			return false;
		}
		
		return true;
	}
	
	


	@Override
	public Item createItem(String name) {
		Item item = null;
		
		if(name == "sword") item = new Sword();
		if(name == "shield") item = new Shield();
		if(name == "bow") item = new Bow();
		
		return item;
	}


	@Override
	public void postprocessItem(String name) {
		ItemData itemData = repository.get(name);
		if(itemData != null) itemData.currentCount++;
	}

}
