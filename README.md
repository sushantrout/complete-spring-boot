# complete-spring-boot
<dl>
  <dt><h3>Object Relational Mapping</h3></dt>
  <dd>Object Relational Mapping (ORM) is a functionality which is used to develop and maintain a relationship between an object and relational database by mapping an object state to database column. It is capable to handle various database operations easily such as inserting, updating, deleting etc.</dd>
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
