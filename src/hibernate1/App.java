package hibernate1;


	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.cfg.Configuration;

import com.hibernate.project1.Users;


	public class App {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			SessionFactory factory = new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Users.class)
					.buildSessionFactory();
			
			Session session =factory.getCurrentSession();
			
			try {
				session.beginTransaction();
				//create object of entity class type 
	Users user= new Users();
			    //Users user = new Users (102,"Mohammed","Tariq","mohdtariqraza95gmail.com");
				
				//start transaction
			
				//List<Users> user = session.createQuery("from Users").getResultList();
				//for(Users temp:user)
				//{
					//System.out.println(temp);
				//}
				
				//Perform operation
	user=session.get(Users.class,102);
				
				//Updating object
				user.setUsers_lname("Ruman");
				
				//deleting object
				//session.delete(user);
				//commit the transaction 
				session.getTransaction().commit();
				System.out.println(user);
				//System.out.println(user);
			}finally {
				session.close();
				factory.close();
		
			}

		}

	}

	