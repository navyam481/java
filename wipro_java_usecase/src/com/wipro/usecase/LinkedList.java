package com.wipro.usecase;

class UserNode {
    String userId;
    String userName;
    UserNode next;

    public UserNode(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
        this.next = null;
    }
}

class UserLinkedList 
{
    private UserNode head;

    // Add a new user to the linked list
    public void addUser(String userId, String userName) {
        UserNode newUser = new UserNode(userId, userName);
        if (head == null) {
            head = newUser;
        } else {
            UserNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
        System.out.println("User added: " + userName);
    }

    // Display all users
    public void displayUsers() {
        if (head == null) {
            System.out.println("No users in the list.");
            return;
        }
        UserNode temp = head;
        while (temp != null) {
            System.out.println("UserID: " + temp.userId + ", Name: " + temp.userName);
            temp = temp.next;
        }
    }

    // Delete a user by ID
    public void deleteUser(String userId) {
        if (head == null) {
            System.out.println("User list is empty.");
            return;
        }
        if (head.userId.equals(userId)) {
            head = head.next;
            System.out.println("User " + userId + " deleted.");
            return;
        }
        UserNode temp = head;
        while (temp.next != null && !temp.next.userId.equals(userId)) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("User not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("User " + userId + " deleted.");
        }
    }

    // Search for a user
    public void searchUser(String userId) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId.equals(userId)) {
                System.out.println("User found: " + temp.userName);
                return;
            }
            temp = temp.next;
        }
        System.out.println("User not found.");
    }
}

public class LinkedList {
    public static void main(String[] args) {
        UserLinkedList userList = new UserLinkedList();

        // Adding users
        userList.addUser("101", "Alice");
        userList.addUser("102", "Bob");
        userList.addUser("103", "Charlie");

        // Display users
        System.out.println("\nUser List:");
        userList.displayUsers();

        // Search for a user
        System.out.println("\nSearching for User 102:");
        userList.searchUser("102");

        // Delete a user
        System.out.println("\nDeleting User 102:");
        userList.deleteUser("102");

        // Display users after deletion
        System.out.println("\nUpdated User List:");
        userList.displayUsers();
    }
}

