# complete-spring-boot
<dl>
  <dt><h3>Object Relational Mapping</h3></dt>
  <dd>ORM or Object Relational Mapping is a system that implements the responsibility of mapping the Object to Relational Model. That means it is responsible to store Object Model data into Relational Model and further read the data from Relational Model into Object Model.</dd>
  <dt><h3>Mapping Directions</h3></dt>
  <dd>
    <ol>
      <li><b>Unidirectional relationship: </b> In this relationship, only one entity can refer the properties to another. It contains only one owing side that specifies how an update can be made in the database.</li>
      <li><b>Bidirectional relationship: </b>This relationship contains an owning side as well as an inverse side. So here every entity has a relationship field or refer the property to other entity.</li>
    </ol>
  </dd>

  <dt>
    <h4>Types of Mapping</h4>
  </dt>
  <dd>
    Following are the various ORM mappings: -<br>
    <ol>
      <li><b>One-to-one   :</b> This association is represented by @OneToOne annotation. Here, instance of each entity is related to a single instance of another entity.</li>
      <li><b>One-to-many  :</b> This association is represented by @OneToMany annotation. In this relationship, an instance of one entity can be related to more than one instance of another entity.</li>
      <li><b>Many-to-one  :</b> This mapping is defined by @ManyToOne annotation. In this relationship, multiple instances of an entity can be related to single instance of another entity.</li>
      <li><b>Many-to-many :</b> This association is represented by @ManyToMany annotation. Here, multiple instances of an entity can be related to multiple instances of another entity. In this mapping, any side can be the owing side.</li>
    </ol>
  </dd>
</dl>

<h3>One-To-One</h3>
<h4>With forgain key</h4> (https://github.com/sushantrout/complete-spring-boot/tree/main/one-to-one-with-forgain-key)

```

@Entity
@Table(name = "tbl_employee")
@Data
public class Employee {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "employee_name")
	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", referencedColumnName = "id")
	private Address address;

}
```

```
@Entity
@Table(name = "tbl_address")
@Data
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "country")
	private String country;
	
	@OneToOne(mappedBy = "address")
	private Employee employee;
}
```

<h3>With shared primary key</h3> (https://github.com/sushantrout/complete-spring-boot/tree/main/one-to-one-with-shared-primary-key)

```

@Entity
@Table(name = "tbl_employee")
@Data
public class Employee {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "employee_name")
	private String name;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "employee", optional = true)
	@PrimaryKeyJoinColumn
	private Address address;

}
```

```

@Entity
@Table(name = "tbl_address")
@Data
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "country")
	private String country;
	
	@OneToOne(optional = true)
	@JoinColumn(name = "employee_id")
	@MapsId
	private Employee employee;
}

```

<h3>Using join table</h3> (https://github.com/sushantrout/complete-spring-boot/tree/main/one-to-one-with-third-table)

```
@Entity
@Table(name = "tbl_employee")
@Data
public class Employee {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "employee_name")
	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "employee_address",
		joinColumns = { @JoinColumn(referencedColumnName = "id", name = "employee_id") },
		inverseJoinColumns = { @JoinColumn(referencedColumnName = "id", name = "address_id", unique = true) })
	private Address address;

}
```

```
@Entity
@Table(name = "tbl_address")
@Data
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "country")
	private String country;
	
	@OneToOne(mappedBy = "address")
	private Employee employee;
}
```
