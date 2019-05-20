# farm-eaze

## About project :

      From farm-eaze website a farmer can choose any equipment ranging heavy or
      
      commercial use Tillage, Landscaping, Seeding, Plantation and many more...
      
      and farmer can get that equipment to their field directly in single a click.
      
       
# Requirements :

     1. As an administrator, he should able to access or modify all providers', equipments'
        and users' details.
        
        Administrator should
        
        * list all Providers' details.
     
        * list all EndUsers' details.
     
     2. As a Consumer,
     
         * I Can select any equipment from the list.
         
         * And for that selected equipment, he needs to get providers details with available slot.
        
         * From that available slot timings,I can able to book the slot.
         
         * After successful booking,Consumer will get confirmation message to the registered mobile number.
            As well as the Provider will get confirmation message to the registered mobile number.
    
  
# Use Cases :

     * admin-Login
     
     * User-Login
     
     * List of equipments 
  
  
  
# Designing:

# Tables :
     Table-1: Provider_table
     
  |Provider_id | Provider_Name| Product | Manufacturer_year| Tractor Reg No| mobile_no | Pincode | Village| Mandal| District |State |
 |---|--------------|--------|----------------|---------------|-----------|---------|-----------|-----------|-----------|-------|
|1 | Customer1   |Tractor | Mahindra575-2014|  AP21 BX5205  |9848505050 |560075   |Village1  | Mandal1  | Kurnool    | AP|
|2 | Customer2    |Dozer | JohnDeere-5055_2015|  AP02NM6302  |9848606060 |518124   |Village2  | Mandal2  | Ananthpur   | AP|
 
   
   


      Table-2:Equipment_table
      
 |provider_id |NameofEquipment|Description  | 
 |-------------|---------------|-----------------|
 |1   | Rotovato      |  36 blades      |            
 |2   | Baler         |  45HP range     |           
 |            |               |                 |     
 |            |               |                 |
 |            |               |                 |
   
   
    
    

      Table-3:User_table
      
  |user_id | UserName |Mobile_no      |Pincode          | village|
  |----|----------|---------------|-----------------|---|
  | Id1   | User1    | 8494949494    |  518124         | village1|           
  | Id2  | User2    | 9494944999    |  581414         |   village2|        
  |    |          |               |                 |        |
  |    |          |               |                 |        | 
  |    |          |               |                 |        |
  
  
      Table-4:Slot_table
      
      
  | provider_id | From Date |from time   | To date    | to time|
  |-------------|-----------|------------|------------|--------|
  | 1   | 14/10/2018    | 11AM   |  14/10/2018      | 2PM  |           
  | 2  | 16/10/2018     | 8AM    |  17/10/2018     | 5PM  |        
  |  1 | 16/10/2018     |  9AM   |   16/10/2018    | 12PM |
  |  1  | 20/10/2018   |  2PM   | 20/10/2018       | 6PM  | 
 
      
   
   

