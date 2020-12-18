object SpaceAge {
  type EarthAge = Double

  def secsToYears(secs: Double): EarthAge = secs / (60 * 60 * 24 * 365.25)

  def onEarth(age: Double): EarthAge = secsToYears(age)

  def onMercury(age: Double): EarthAge = secsToYears(age) / 0.240846
  def onVenus(age: Double): EarthAge = secsToYears(age) / 0.61519726
  def onMars(age: Double): EarthAge = secsToYears(age) / 1.8808158
  def onJupiter(age: Double): EarthAge = secsToYears(age) / 11.862615
  def onSaturn(age: Double): EarthAge = secsToYears(age) / 29.447498
  def onUranus(age: Double): EarthAge = secsToYears(age) / 84.016846
  def onNeptune(age: Double): EarthAge = secsToYears(age) / 164.79132
}
