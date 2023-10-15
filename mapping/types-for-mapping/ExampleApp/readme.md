Here , I have created a persistent class called Item and a app that maps/saves this Item object to a table.
You can see how the java variables are mapped to mysql datatypes.
- java.lang.Long is mapped to BIGINT(item_id)
- java.util.Date is mapped to DATE(date_of_purchase) 
- byte[] is mapped to BLOB(item_name)
- java.util.Currency is mapped to VARCHAR(currency)

## Persistent class
<img width="431" alt="Screenshot 2023-10-15 154744" src="https://github.com/giriharan13/HibernateBasics/assets/119475958/4284ee36-737d-4c2d-b13d-0824faa5f929">

## Results in Database 

<img width="292" alt="Screenshot 2023-10-15 153655" src="https://github.com/giriharan13/HibernateBasics/assets/119475958/65078ef5-5ac3-45f9-95c2-d95b92f058a3">


<img width="378" alt="Screenshot 2023-10-15 153634" src="https://github.com/giriharan13/HibernateBasics/assets/119475958/cc5ed125-e03f-4989-8010-a25cc719fecd">