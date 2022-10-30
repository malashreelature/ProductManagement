package ProductManagement.entity;


import javax.persistence.*;

@Entity
    @Table(name = "userslist")
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String email;

        private String password;

        private String firstName;

        private String lastName;

        public User() {
            super();
        }
        public User(Long id, String email, String password, String firstName, String lastName) {
            super();
            this.id = id;
            this.email = email;
            this.password = password;
            this.firstName = firstName;
            this.lastName = lastName;

        }
        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
            this.password = password;
        }
        public String getFirstName() {
            return firstName;
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }


}
