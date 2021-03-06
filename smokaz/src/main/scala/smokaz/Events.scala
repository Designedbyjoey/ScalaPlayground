package smokaz

import akka.actor.ActorRef


abstract class DealerProtocol
class PlacedCigaretteOnTable extends DealerProtocol
class PlacedPaperOnTable extends DealerProtocol
class PlacedMatchOnTable extends DealerProtocol

abstract class SmokerProtocol
class PickedUpCigarette extends SmokerProtocol
class PickedUpPaper extends SmokerProtocol
class PickedUpMatch extends SmokerProtocol
class NeedCigarette extends SmokerProtocol
class NeedMatch extends SmokerProtocol
class NeedPaper extends SmokerProtocol
case class GrabCigarette(smoker: ActorRef) extends SmokerProtocol
case class GrabPaper(smoker: ActorRef) extends SmokerProtocol
case class GrabMatch(smoker: ActorRef) extends SmokerProtocol
case class IAmSmoking(smoker: ActorRef) extends SmokerProtocol
case class IAmCraving(smoker: ActorRef) extends SmokerProtocol

abstract class TableProtocol
class TableAvailable extends TableProtocol
class CigaretteOnTable extends TableProtocol
class MatchOnTable extends TableProtocol
class PaperOnTable extends TableProtocol
