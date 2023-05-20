# Semester Project (2nd semester)
## International Trading Platform (Commodity Exchange)

### Choosing Countries
- Each person selects a country.

### Architecture
- Central exchange
- National exchanges

## Tasks
1. Complete the RESTful ru.itis.Application.service for currencies (Currency).
2. Create a separate project - Semester 2.
3. Implement authentication.
4. Create a page that displays all currencies and make a request for currencies through a REST ru.itis.Application.service.
5. Create a page for adding a new product:
   - Pass the data of the new product through a form.
   - Generate an innerUID.
   - Save the data in the database.
   - Send the data of the new product to the central exchange.
6. Create a page to retrieve new products from the central exchange.

## Domain Model

### Country
- code
- name

### Product
- code
- name
- unit of measurement

### Unit of Measurement
- code
- name

### Currency
- code
- name

### State
- code
- name

### Organization Proposal
- organization
- country code
- product
- volume
- currency
- unit cost
- minimum batch volume
- proposal submission date

### Product Purchase Contract
- seller organization (manufacturer)
- product
- volume
- contract date
- buyer organization
- contract cost
- contract currency

### Contract Payment
- contract
- payment date
- currency
- amount

### Contract Delivery
- contract
- delivery date

### Protocols
- Seller organization creates a proposal -> National exchange -> Central exchange
