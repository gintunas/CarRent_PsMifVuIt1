package com.company.keliones

import com.company.kainosSkaiciavimas.Ikainiai

@throws[UnsupportedOperationException]
trait EkonomiskasAutomobilis extends Kelione {
  transportoPriemonesPavadinimas = "Honda Civic 5 gen."
  val _ikainiai: Ikainiai = new Ikainiai(100, 30, 14, 6, 5, 1522, 7500, 30000)

  override def gautiTransportoPriemonesIkainius: Ikainiai = _ikainiai

  override def paliktiTransportoPriemone(): Unit = { //palikti priemoneId
    System.out.println("Paliktas Honda Civic, id: " + priemoneId)
  }

  override def pranestiApieNetiketuma(): Unit = System.out.println("Dekojame uz pranesta Honda Civic, id: " + priemoneId + " apgadinima.")
}