package bodyanich7;

import bodyanich7.Safe;
import bodyanich7.SafeInfo;
import bodyanich7.WeaponSafe;
import bodyanich7.Jewelry;

public class SafeAllInfo {

	public static void main(String[] args) {
		Safe<? super SafeInfo> safe = new Safe<SafeInfo>();
		safe.WriteData(new WeaponSafe("Burgas", 50, 344.2, "For Pistols"));
		safe.WriteData(new WeaponSafe("Liverty", 123, 621.4, "For Rifles"));
		safe.WriteData(new WeaponSafe("Livert", 2, 621.4, "For Rifles"));
		safe.WriteData(new Jewelry("Targo", 10, 100.2, "circlets"));
		safe.WriteData(new Jewelry("Robyr", 15, 150.0, "pendants"));
		SafeInfo smallestweight = safe.findMinWeight();
        System.out.print("\t\t\t\tMININMAL WEIGHT IS IN ELEMENT OF MY PROJECT: \n");
        smallestweight.print();
        System.out.print("\t\t\t\tJewelry Weight IS:" + safe.Getweight(0, 1));
        System.out.print("\t\t\t\tWeaponSafe Weight IS:"+ safe.Getweight(2, 4));

	}

}
