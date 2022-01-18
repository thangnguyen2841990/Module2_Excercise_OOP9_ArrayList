package com.codegym;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("----MENU QUẢN LÝ THẺ MƯỢN THƯ VIỆN----");
        System.out.println("1. Hiển thị toàn bộ thông tin thẻ mượn.");
        System.out.println("2. Thêm thẻ mượn.");
        System.out.println("3. Hiển thị toàn bộ thẻ mượn cần trả vào cuối tháng");
        System.out.println("4. Thoát");
        CardManagement cardManagement = new CardManagement();
        int choice = -1;
        while (true) {
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            if (choice == 4) {
                break;
            }
            if (choice > 4) {
                System.out.println("Menu  chỉ có từ 1 => 4");
            }
            switch (choice) {
                case 1: {
                    System.out.println("----Hiển thị toàn bộ thẻ mượn----");
                    cardManagement.displayAllCards();
                    if (cardManagement.getCards().size() == 0){
                        System.out.println("Không có thẻ mượn nào để hiện thị!");
                    }
                    break;
                }
                case 2: {
                    System.out.println("----Thêm thẻ mượn mới----");
                    System.out.println("Nhập số lượng thẻ mượn cần thêm: ");
                    int n = scanner.nextInt();
                    Card newCard;
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập thẻ mượn thứ: " + (i + 1));
                        newCard = inputNewCard();
                        cardManagement.addNewCard(newCard);
                        System.out.println("Đã thêm thành công!");
                    }
                    break;
                }
                case 3: {
                    System.out.println("----Hiển thị toàn bộ thẻ mượn cần trả vào cuối tháng----");
                    cardManagement.findCard();
                    break;
                }
            }
        }
    }

    public static Card inputNewCard() {
        Scanner inputCard = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên");
        String name = inputCard.nextLine();
        System.out.println("Nhập MSSV: ");
        String number = inputCard.nextLine();
        System.out.println("Nhập ngày sinh: ");
        String bỉthDay = inputCard.nextLine();
        System.out.println("Nhập lớp đang học: ");
        String className = inputCard.nextLine();
        System.out.println("Nhập số phiếu mượn: ");
        int number1 = scanner.nextInt();
        System.out.println("Nhập ngày mượn: ");
        String toDate = inputCard.nextLine();
        System.out.println("Nhập ngày trả: ");
        String formDate = inputCard.nextLine();
        System.out.println("Nhập số hiệu sách: ");
        String codeOfBook = inputCard.nextLine();

        return new Card(number1, toDate, formDate, codeOfBook, new Student(name, number, bỉthDay, className));
    }

}

