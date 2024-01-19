public class Mahasiswa {
        String nama;
        String health;
        String weapon;
        String attack;
        String armor;
        String defence;


        Mahasiswa(String nama, String health, String weapon, String attack, String armor, String defence){
            this.nama = nama;
            this.health = health;
            this.weapon = weapon;
            this.attack = attack;
            this.armor = armor;
            this.defence = defence;
        }
        void show(){
            System.out.println("Nama : " + this.nama);
            System.out.println("Health : " + this.health);
            System.out.print("Weapon : " + this.weapon);
            System.out.println(" "+"Attack : " + this.attack);
            System.out.print("Armor : " + this.armor);
            System.out.println(" "+"Defence : " + this.defence);
        }

        void setNama(String nama) {
            this.nama = nama;
        }

    }


